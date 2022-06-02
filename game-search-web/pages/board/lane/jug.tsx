import BoardForm from "../../../components/BoardForm";
import BoardNavbar from "../../../components/BoardNavbar";
import SubCategoryNavbar from "../../../components/SubCategoryNavbar";

const jug = () => {
    return (
        <div>
            <BoardNavbar />
            <SubCategoryNavbar />
            <BoardForm category={"정글"} />
        </div>
    )
}

export default jug;
