import {useRouter} from "next/router";
import {posts} from "../data";
import {replies} from "../data";
import Link from "next/link";

const PostForm = () => {
    const router = useRouter();
    const {pid} = router.query;

    const postData = posts.filter((i) => i.id === Number(pid));
    const replyData = replies.filter((i) => i.postId === Number(pid));

    return <div>
    <div>
        <div>{postData[0].title}</div>
        <div>{postData[0].writer}</div>
        <div>{postData[0].subCategory}</div>
        <div>{postData[0].content}</div>
    </div>
    <div style={{marginTop: "10px"}}>
        <div>{replyData[0].writer}</div>
        <div>{replyData[0].content}</div>
        <div>{replyData[0].createAt}</div>
    </div>
        <Link href={}>
            <a>
              목록으로
            </a>
        </Link>
    </div>
}

export default PostForm;
