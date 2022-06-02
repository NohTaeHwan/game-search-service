import {IPost, IReply} from "./type";

export const posts:IPost[] = [
    {
        id: 1,
        title: "1번 게시글 제목",
        content: "1번 게시글 내용",
        writer: "1번 게시글 글쓴이",
        createAt: "2022-05-31",
        category: "메인 카테고리",
        subCategory: "자유",
    },
    {
        id: 2,
        title: "2번 게시글 제목",
        content: "2번 게시글 내용",
        writer: "2번 게시글 글쓴이",
        createAt: "2022-05-31",
        category: "메인 카테고리",
        subCategory: "자유",
    },
    {
        id: 3,
        title: "3번 게시글 제목",
        content: "3번 게시글 내용",
        writer: "3번 게시글 글쓴이",
        createAt: "2022-05-31",
        category: "메인 카테고리",
        subCategory: "탑",
    },
    {
        id: 4,
        title: "4번 게시글 제목",
        content: "4번 게시글 내용",
        writer: "4번 게시글 글쓴이",
        createAt: "2022-05-31",
        category: "메인 카테고리",
        subCategory: "탑",
    },
    {
        id: 5,
        title: "5번 게시글 제목",
        content: "5번 게시글 내용",
        writer: "5번 게시글 글쓴이",
        createAt: "2022-05-31",
        category: "메인 카테고리",
        subCategory: "정글",
    },
    {
        id: 6,
        title: "6번 게시글 제목",
        content: "6번 게시글 내용",
        writer: "6번 게시글 글쓴이",
        createAt: "2022-05-31",
        category: "메인 카테고리",
        subCategory: "정글",
    },
    {
        id: 7,
        title: "7번 게시글 제목",
        content: "7번 게시글 내용",
        writer: "7번 게시글 글쓴이",
        createAt: "2022-05-31",
        category: "메인 카테고리",
        subCategory: "미드",
    },
    {
        id: 8,
        title: "8번 게시글 제목",
        content: "8번 게시글 내용",
        writer: "8번 게시글 글쓴이",
        createAt: "2022-05-31",
        category: "메인 카테고리",
        subCategory: "미드",
    },
    {
        id: 9,
        title: "9번 게시글 제목",
        content: "9번 게시글 내용",
        writer: "9번 게시글 글쓴이",
        createAt: "2022-05-31",
        category: "메인 카테고리",
        subCategory: "원딜",
    },
    {
        id: 10,
        title: "10번 게시글 제목",
        content: "10번 게시글 내용",
        writer: "10번 게시글 글쓴이",
        createAt: "2022-05-31",
        category: "메인 카테고리",
        subCategory: "원딜",
    },
    {
        id: 11,
        title: "9번 게시글 제목",
        content: "9번 게시글 내용",
        writer: "9번 게시글 글쓴이",
        createAt: "2022-06-01",
        category: "메인 카테고리",
        subCategory: "서포터",
    },
    {
        id: 12,
        title: "10번 게시글 제목",
        content: "10번 게시글 내용",
        writer: "10번 게시글 글쓴이",
        createAt: "2022-06-01",
        category: "메인 카테고리",
        subCategory: "서포터",
    },
]

export const replies:IReply[] = [
    {
        postId: 1,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "1번 댓글입니다",
    },
    {
        postId: 2,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "2번 댓글입니다",
    },
    {
        postId: 3,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "3번 댓글입니다",
    },
    {
        postId: 4,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "4번 댓글입니다",
    },
    {
        postId: 5,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "5번 댓글입니다",
    },
    {
        postId: 6,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "6번 댓글입니다",
    },
    {
        postId: 7,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "7번 댓글입니다",
    },
    {
        postId: 8,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "8번 댓글입니다",
    },
    {
        postId: 9,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "9번 댓글입니다",
    },
    {
        postId: 10,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "10번 댓글입니다",
    },
    {
        postId: 11,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "11번 댓글입니다",
    },
    {
        postId: 12,
        writer: "작성자",
        createAt: "22-06-02", // new Date?
        content: "12번 댓글입니다",
    },
]
