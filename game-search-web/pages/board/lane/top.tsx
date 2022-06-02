import BoardForm from "../../../components/BoardForm";
import BoardNavbar from "../../../components/BoardNavbar";
import SubCategoryNavbar from "../../../components/SubCategoryNavbar";

const top = () => {
    return (
        <div>
            <BoardNavbar />
            <SubCategoryNavbar />
            <BoardForm category={"탑"} />
        </div>
    )
}

export default top;
