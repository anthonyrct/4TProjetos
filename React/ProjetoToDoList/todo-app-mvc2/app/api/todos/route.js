//get e post
import { getTodos, createTodo } from "@/controllers/TodoController";
import connectMongo from "@/utils/dbConnect";
import { NextResponse } from "next/server";

//get
export async function GET() {
   try{
    const todos = await getTodos();
    return NextResponse.json({sucess: true, data:todos});
   }catch (err){
    return NextResponse.json({sucess: false}, {status: 400});
   }
}

   //post
   export async function POST(req){
    await connectMongo();
    try{
        const data = await req.json();
        const todo = await createTodo(data);
        return NextResponse.json({sucess: true, data: todo});
    }catch(err) {
        return NextResponse.json({sucess: false}, {status: 400});
    }
   }
