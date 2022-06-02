import BoardForm from "../../../components/BoardForm";
import BoardNavbar from "../../../components/BoardNavbar";
import SubCategoryNavbar from "../../../components/SubCategoryNavbar";

const adc = () => {
    return (
        <div>
            <BoardNavbar />
            <SubCategoryNavbar />
            <BoardForm category={"원딜"} />
        </div>
    )
}

export default adc;
