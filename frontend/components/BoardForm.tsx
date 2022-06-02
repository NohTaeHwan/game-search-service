import {FunctionComponent} from "react";
import {posts} from "../data";
import Link from "next/link";

const BoardForm:FunctionComponent<{category: string}> = ({category}) => {
    const categoryPosts = category === "라인" ? posts.filter((i) => i.subCategory !== "자유") : posts.filter((i) => i.subCategory === category);
    return (
        <div>
            {
                categoryPosts.map((i, index) =>
                {return <div key={index}>
                    <Link href={`/board/${i.id}`}>
                        <a>
                            <span style={{marginRight: "5px"}}>{i.id}</span>
                            <span style={{marginRight: "5px"}}>{i.title}</span>
                            <span style={{marginRight: "5px"}}>{i.writer}</span>
                            <span style={{marginRight: "5px"}}>{i.createAt}</span>
                    </a>
                    </Link>
                </div>})
            }
        </div>
    )
}

export default BoardForm;
