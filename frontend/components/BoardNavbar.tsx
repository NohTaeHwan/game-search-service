import {NextPage} from "next";
import {FunctionComponent, useEffect, useState} from "react";
import {useRouter} from "next/router";
import Link from "next/link";

const NavItem:FunctionComponent<{activeItem: string, setActiveItem:Function, name:string, route:string}> = ({activeItem, setActiveItem, name, route}) => {
    return (
        activeItem !== name ? (
            <Link href={route}>
                <a>
                    <span style={{marginRight: "5px"}} onClick={() => {setActiveItem(name)}}>{name}</span>
                </a>
            </Link>
        ) :
            <span style={{marginRight: "5px", fontWeight: "bold"}}>{name}</span>
    )
}

const BoardNavbar: NextPage = () => {
    const [activeItem, setActiveItem] = useState<string>("free");
    const {pathname} = useRouter();

    useEffect(()=>{
        if(pathname === "/free") {
            setActiveItem("free");
        }
        if(pathname === "/lane") {
            setActiveItem("lane");
        }
    },[])
    return <div>
        <NavItem activeItem={activeItem} setActiveItem={setActiveItem} name={"자유게시판"} route={"/board/free"} />
        <NavItem activeItem={activeItem} setActiveItem={setActiveItem} name={"라인별게시판"} route={"/board/lane"} />
    </div>
}

export default BoardNavbar;
