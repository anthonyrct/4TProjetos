import mongoose from 'mongoose';
const CursoSchema = new mongoose.Schema({
    userId:{
        type:mongoose.Schema.Types.ObjectId,
        ref:"User",
        required: true
    },

    title:{
        type:String,
    },
    status:{
        type: String,
        enum:["Concluido", "Em progresso"],
        default:"Em progresso"

    }
});

const Curso = mongoose.models.Curso || mongoose.model("Todo", CursoSchema);

export default Curso;

