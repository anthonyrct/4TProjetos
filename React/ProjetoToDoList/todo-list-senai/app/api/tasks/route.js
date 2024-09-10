import { jwtMiddleware } from "@/utils/authMiddleware";
import { getTodos, addTask } from "@/controllers/TaskController";

//metodo get para listar as tarefas do usuario

export async function GET(req, res) {
    return jwtMiddleware(async (req, res) =>{
        await getTodos(req, res);
    })(req, res);
}

// metodo post

export async function POST(req, res){
    return jwtMiddleware(async(req, res) =>{
        await addTask(req,res);
    })(req,res);
}