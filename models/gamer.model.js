/**
 *
 * In this document you create the model of the object in the data base.
 * 
 * @version 1.01.001 2022-06-28.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const gamerModelShema = new Schema({
    gamers: [{
        type: String,
        trim: true
    }]
});

const gamerModel = mongoose.model('Gamer',gamerModelShema) //para hacer efectiva la construccion , 'Gamer' es el nombre de la coleccion
module.exports = gamerModel;