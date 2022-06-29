
/**
 *
 * In this document you can watch the gamer's than the createGame will display.
 * 
 * @version 1.01.001 2022-06-28.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */
const express = require('express');
const router = express.Router();

router.get('/gamers', async (req, res, next) => {

    const answer = {
        id: "fffff-ggg-jjjjj",
        type: "",
        gamer1: "Raul Andres",
        gamer2: "Pedro",
        gamer3: "Juan",
    };
    res.json(answer);
});

module.exports = router;