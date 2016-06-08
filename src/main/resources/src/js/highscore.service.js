pokerApp.factory('highscoreService', function ($http, $q) {

    let promise;

    return {
        getScore
    };

    function getScore() {
        if (!promise) {
            promise = $http.get('/highscore-table')
                .then(function (response) {
                    return response.data;
                });
        }
        return promise;
    }
});

