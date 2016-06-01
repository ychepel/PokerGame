pokerApp.component('highscores', {
    templateUrl: 'fragments/highscores.html',
    controller: function ($http) {
        var vm = this;

        $http.get('/highscores').
            then(function (response) {
                vm.highScores = response.data;
            });
    }
});