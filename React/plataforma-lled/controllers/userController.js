import User from '../models/User';

export const getUserById = async (req, res) =>{
    try {
        const user = await User.findById(req.query.id);
        if(!user) return res.status(404).json({message: 'Usuario não encontrado'});
    res.status(200).json(user);
} 
    catch (error) {
        res.status(500).json({error: 'Error no servidor'});
    }
};