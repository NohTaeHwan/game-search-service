import BoardForm from "../../../components/BoardForm";
import BoardNavbar from "../../../components/BoardNavbar";
import SubCategoryNavbar from "../../../components/SubCategoryNavbar";

const index = () => {
    return (
        <div>
            <BoardNavbar />
            <SubCategoryNavbar />
            <BoardForm category={"라인"} />
        </div>
    )
}

export default index;
