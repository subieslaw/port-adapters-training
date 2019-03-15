org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/forecast'
    }
    response {
        status 200
        headers {
            header('Content-Type', 'application/json')
        }
        body (
         "condition" : "good"
        )
    }

}