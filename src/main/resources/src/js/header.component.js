pokerApp.component('pageHeader', {
    templateUrl: 'fragments/header.html',
    controller: function(usernameService) {
        if(usernameService.getName()) {
            this.showlogin = false;
            this.showlogout = true;
        } else {
            this.showlogin = true;
            this.showlogout = false;
        }

        this.logout = function(usernameService) {
            console.log('we are here');
            usernameService.logOut();
        }
    }
});