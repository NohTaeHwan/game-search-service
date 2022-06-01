import BoardIndex from "../index";
import {NextPage} from "next";
import BoardForm from "../../../components/BoardForm";

const freeIndex: NextPage = () => {
    return (
        <div>
            <BoardForm category={"자유"} />
        </div>
    )
}

export default freeIndex;
