pokerApp.component('highscores', {
    templateUrl: 'fragments/highscores.html',
    controller: function ($http) {
        var vm = this;

        $http.get('/highscore-table').
            then(function (response) {
                vm.highScores = response.data;
            });
    }
});