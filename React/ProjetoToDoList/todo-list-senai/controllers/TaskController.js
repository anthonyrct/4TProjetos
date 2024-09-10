import Task from "@/models/Task";
import dbConnect from "@/utils/dbConnect";
import { connect } from "mongoose";

//carregar todos

export const getTodos = async (req, res) =>{
    await dbConnect();
    try {
       const tasks = await Task.find({UserId: req.user.userId});
        res.status(200).json({tasks});
    } catch (error) {
        res.status(500).json({error})
    }
}


export const addTask = async (req, res) =>{
    const {title} = req.body;
    await dbConnect();
    try {
        const newTask = new Task({
            title,
            userId: req.user.userId,
        });
        await newTask.save();
        res.status(201).json({Task: newTask});
    } catch (error) {
        res.status(500).json({message:'Erro ao adicionar tarefa'});
    }
}



//Atualizar Tarefa
export const updateTask = async (req, res) => {
    const { id } = req.query;
    const data = req.body;
    await connectMongo();


    try {
        const updatedTask = await Task.findOneAndUpdate(
            { _id: id, userId: req.user._id },
            { data },
            { new: true }
        );
        if (!updatedTask) return res.status(404).json({
            message: 'Tarefa não encontrada'
        });
        res.status(200).json({ todo: updatedTask });
    } catch (error) {
        res.status(500).json({ message: 'Erro ao atualizar tarefa' });
    }
};




//deleta as tarefas

export const deleteTask = async (req, res) => {
    const { id } = req.query;
    await connectMongo();


    try {
        const deletedTask = await Task.findOneAndDelete({ _id: id, userId: req.user.userId });
        if (!deletedTask) return res.status(404).json({ message: 'Tarefa não encontrada' });
        res.status(200).json({ message: 'Tarefa deletada com sucesso' });
    } catch (error) {
        res.status(500).json({ message: 'Erro ao deletar tarefa' });
    }
};
