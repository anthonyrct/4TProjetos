import Curso from "@/models/Curso";
import dbConnect from "@/utils/dbConnect";
import { connect } from "mongoose";

//carregar todos

export const getCursos = async(req, res) =>{
    await dbConnect();
    try{
        const cursos = await Curso.find({UserId: req.user.userId});
        res.status(200).json({cursos});
    }catch(error){
        res.status(500).json({error})
    }
}


export const addCursos = async (req, res) =>{
    const {title} = req.body;
    await dbConnect();
    try {
        const newCurso = new Curso({
            title,
            userId: req.user.userId,
        });
        await newCurso.save();
        res.status(201).json({Curso: newCurso});
    } catch (error) {
        res.status(500).json({message:'Erro ao adicionar tarefa'});
    }
}


//Atualizar Tarefa
export const updateCursos = async (req, res) => {
    const { id } = req.query;
    const data = req.body;
    await connectMongo();


    try {
        const updatedCurso = await Task.findOneAndUpdate(
            { _id: id, userId: req.user._id },
            { data },
            { new: true }
        );
        if (!updatedCurso) return res.status(404).json({
            message: 'Curso não encontrado'
        });
        res.status(200).json({ todo: updatedCurso });
    } catch (error) {
        res.status(500).json({ message: 'Erro ao atualizar curso' });
    }
};