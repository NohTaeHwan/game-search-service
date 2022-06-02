import BoardForm from "../../../components/BoardForm";
import BoardNavbar from "../../../components/BoardNavbar";
import SubCategoryNavbar from "../../../components/SubCategoryNavbar";

const mid = () => {
    return (
        <div>
            <BoardNavbar />
            <SubCategoryNavbar />
            <BoardForm category={"미드"} />
        </div>
    )
}

export default mid;
