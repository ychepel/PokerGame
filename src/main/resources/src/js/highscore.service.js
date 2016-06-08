pokerApp.factory('highscoreService', function ($http, $q) {

    let results;

    return {
        getScore
    };

    function getScore() {
        let promise;
        if (!results) {
            promise = $http.get('/highscore-table')
                .then(function (response) {
                    results = response.data;
                    return response.data;
                });
        } else {
            promise = $q.when(results);
        }
        return promise;
    }
});

