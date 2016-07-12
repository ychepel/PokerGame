pokerApp.component('home', {
    templateUrl: 'fragments/home.html',
    controller: function(usernameService) {
        if(usernameService.getName()) {
            this.username = usernameService.getName();
        }
        else {
            this.username = 'Guest';
        }
    }
});