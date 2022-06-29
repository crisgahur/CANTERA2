/**
 *
 * In this document you post in the data base the gamers.
 * 
 * @version 1.01.001 2022-06-28.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */
const express = require('express');
const router = express.Router();

const Gamer = require('../models/gamer.model');

module.exports = router;

// post gamers listing. 
router.post('/gamer', async (req, res, next) => {
  try {
    const {gamers} = req.body;
    const gamer= new Gamer({gamers});
    const data = await gamer.save();
    res.json({message: 'Gamers created successfully',
    data
  })

  .catch((err) => {res.status(400).json({
    error: err.message,
    message: "Game creation failed"
  })});

  } catch (error) {
    res.status(500).json({message: error.message,
    stack: error.stack});
  }
});


