const { response } = require('express')
const neDB = require('../configurations/database')
const api = {}

api.save = (request, response) => {
    const canonical = request.body
    neDB.insert (canonical, (exception, cards)=>{
        if (exception){
            const sentence = "Erro ao gravar cartão"
            console.error(sentence, exception)

            response.status(exception.status | 400)
            response.json({'mensagem':sentence})
        }

        console.log('Cartão salvo com sucesso', cards)
        response.status(201)
        response.json(cards)
    })

    
}

api.findAll = (requeste,response) => {
    neDB.find({}).sort({name: 1}).exec((exception,cards)=>{
        if(exception){
            const sentence =  'Erro ao gerar lista de cartões'
            console.error(sentence,exception)

            response.status(exception.status | 400)
            response.json({'mensagem': sentence})
        
        }
        console.log('lista de  cartões',cards)
        response.json(cards)
    })
}

api.page = (requeste,response) => {
    neDB.find({}).sort({name: 1}).exec((exception,cards)=>{
        if(exception){
            const sentence =  'Erro ao gerar lista de cartões'
            console.error(sentence,exception)

            response.status(exception.status | 400)
            response.json({'mensagem': sentence})
        
        }
        console.log('lista de  cartões',cards)
        response.json(cards)
    })
}

api.findId = (requeste,response) => {
    neDB.find({id}).exec((exception,cards)=>{
        if(exception){
            const sentence =  'Cartão não localizado'
            console.error(sentence,exception)

            response.status(exception.status | 400)
            response.json({'mensagem': sentence})
        
        }
        console.log('Cartão ',cards)
        response.json(cards)
    })
}
api.putId = (request, response) => {
    const canonical = request.body
    neDB.update (canonical, (exception, cards)=>{
        if (exception){
            const sentence = "Erro ao atualizar dados cartão"
            console.error(sentence, exception)

            response.status(exception.status | 400)
            response.json({'mensagem':sentence})
        }

        console.log('Cartão salvo com sucesso', cards)
        response.status(201)
        response.json(cards)
    })    
}
api.deleteId = (request, response) => {
    const canonical = request.body
    neDB.delete (canonical, (exception, cards)=>{
        if (exception){
            const sentence = "Erro ao atualizar dados cartão"
            console.error(sentence, exception)

            response.status(exception.status | 400)
            response.json({'mensagem':sentence})
        }

        console.log('Cartão salvo com sucesso', cards)
        response.status(201)
        response.json(cards)
    })
}
module.exports = api