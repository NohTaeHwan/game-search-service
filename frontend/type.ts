export interface IPost {
    id: number,
    title: string,
    content: string,
    writer: string,
    createAt: string, // new Date?
    category: string,
    subCategory: string,
}

export interface IReply {
    postId: number,
    writer: string,
    createAt: string, // new Date?
    content: string,
}


