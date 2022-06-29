/* **
 *
 * In this document you take the information of creategame.hbs to show it in the route.
 * 
 * @version 1.01.001 2022-06-28.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

const express = require('express');
const router = express.Router();

router.get('/', async (req, res, next) => {
res.render("creategame", {title: "Express"})
});

module.exports = router;