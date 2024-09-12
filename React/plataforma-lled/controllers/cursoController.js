import { connect } from "mongoose";
import Curso from "../models/Curso";
import connectMongo from "@/ultils/mongodb";

export const getAllCursos = async (req, res) => {
  try {
    const cursos = await Curso.find();
    res.status(200).json(cursos);
  } catch (error) {
    res.status(500).json({ error: "Erro ao buscar cursos" });
  }

  };

  export const createCursos = async(data) =>{
    await connectMongo();
    return await Curso.create(data);
  };


  export const updateCursos = async (id, data) => {
    await connectMongo();
    return await Curso.findByIdAndUpdate(id, data, {
      new: true,
      runValidators: true,
    });
  };


  export const deleteCursos = async (id) => {
    await connectMongo();
    return await Curso.deleteOne({ _id: id });
  };
