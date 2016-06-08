pokerApp.component('highscores', {
    templateUrl: 'fragments/highscores.html',
    controller: function (highscoreService) {
        const vm = this;

        highscoreService.getScore().then(function(data) {
            vm.highScores = data;
        });
    }
});