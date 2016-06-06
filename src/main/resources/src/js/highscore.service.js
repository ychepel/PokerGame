pokerApp.factory('highscoreService', function ($http, $q) {

    let results;

    return {
        getScore
    };

    function getScore() {
        if (!results) {
            return $http.get('/highscore-table')
                .then(response => response.data);
        } else {
            $q (resolve => resolve(results));
        }
    }
});

