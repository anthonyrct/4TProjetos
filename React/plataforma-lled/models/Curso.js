import mongoose from "mongoose";
const CursoSchema = new mongoose.Schema({
  userId: {
    type: mongoose.Schema.Types.ObjectId,
    ref: "User",
    required: true,
  },

  title: {
    type: String,
    required: true,
  },
  description: {
    type: String,
    required: true,
  },
  preco: {
    type: String,
    required: true,
  },
});

const Curso = mongoose.models.Curso || mongoose.model("Todo", CursoSchema);

export default Curso;
