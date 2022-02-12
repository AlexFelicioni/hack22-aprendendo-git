const api = require('../controllers/card-controller')

module.exports = (app) => {

    app.route('/cards')
    .post(api.save)
    .get(api.findAll)

    app.route('/cards/{id}')
    .get(api.findId)
    .post(api.putId)
    .delete(api.delete)

    app.route('/cards/paginationAndSorting')
    .page(api.page)
    
}