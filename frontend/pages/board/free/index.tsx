import BoardIndex from "../index";
import {NextPage} from "next";
import BoardForm from "../../../components/BoardForm";
import BoardNavbar from "../../../components/BoardNavbar";
import SubCategoryNavbar from "../../../components/SubCategoryNavbar";

const freeIndex: NextPage = () => {
    return (
        <div>
            <BoardNavbar />
            <SubCategoryNavbar />
            <BoardForm category={"자유"} />
        </div>
    )
}

export default freeIndex;
