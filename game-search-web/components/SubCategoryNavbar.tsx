import {FunctionComponent, useEffect, useState} from "react";
import {useRouter} from "next/router";
import Link from "next/link";

const NavItem:FunctionComponent<{activeItem: string, setActiveItem:Function, name:string, route:string}> = ({activeItem, setActiveItem, name, route}) => {
    return (
        activeItem !== name ? (
                <Link href={route}>
                    <a>
                        <span onClick={() => {setActiveItem(name)}} style={{marginRight: "5px"}}>{name}</span>
                    </a>
                </Link>
            ) :
            <span style={{marginRight: "5px"}}>{name}</span>
    )
}

const SubCategoryNavbar = () => {
    const [activeItem, setActiveItem] = useState<string>("전체");

    const {pathname} = useRouter()

    useEffect(() => {
        if(pathname === "/board/free") {
            setActiveItem("전체");
        }
        if(pathname === "/board/lane") {
            setActiveItem("전체");
        }
        if(pathname === "/board/lane/adc") {
            setActiveItem("원딜");
        }
        if(pathname === "/board/lane/jug") {
            setActiveItem("정글");
        }
        if(pathname === "/board/lane/mid") {
            setActiveItem("미드");
        }
        if(pathname === "/board/lane/sup") {
            setActiveItem("서포터");
        }
        if(pathname === "/board/lane/top") {
            setActiveItem("탑");
        }
    }, [pathname])

    return <div>
        <span>{activeItem}</span>
            {pathname.includes("lane")
                ? <div>
                <NavItem activeItem={activeItem} setActiveItem={setActiveItem} name={"전체"} route={"/board/lane"}/>
                <NavItem activeItem={activeItem} setActiveItem={setActiveItem} name={"탑"} route={"/board/lane/top"}/>
                <NavItem activeItem={activeItem} setActiveItem={setActiveItem} name={"정글"} route={"/board/lane/jug"}/>
                <NavItem activeItem={activeItem} setActiveItem={setActiveItem} name={"미드"} route={"/board/lane/mid"}/>
                <NavItem activeItem={activeItem} setActiveItem={setActiveItem} name={"원딜"} route={"/board/lane/adc"}/>
                <NavItem activeItem={activeItem} setActiveItem={setActiveItem} name={"서포터"} route={"/board/lane/sup"}/>
                </div>
            : <div>
                    <NavItem activeItem={activeItem} setActiveItem={setActiveItem} name={"전체"} route={"/board/free"}/>
                </div>}
    </div>
}

export default SubCategoryNavbar;
