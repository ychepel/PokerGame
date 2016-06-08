pokerApp.component('home', {
    templateUrl: 'fragments/home.html',
    controller: function(usernameService) {
        this.username = usernameService.getName();
    }
});