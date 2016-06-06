var gulp = require("gulp"),//http://gulpjs.com/
    util = require("gulp-util"),//https://github.com/gulpjs/gulp-util
    sass = require("gulp-sass"),//https://www.npmjs.org/package/gulp-sass
    autoprefixer = require('gulp-autoprefixer'),//https://www.npmjs.org/package/gulp-autoprefixer
    minifycss = require('gulp-minify-css'),//https://www.npmjs.org/package/gulp-minify-css
    rename = require('gulp-rename'),//https://www.npmjs.org/package/gulp-rename
    concat = require('gulp-concat'),
    uglify = require('gulp-uglify'),
    babel = require("gulp-babel"),
    log = util.log;

var cssTarget = "src/main/resources/static/css/",
    jsTarget = "src/main/resources/static/js/",
    sassFiles = "src/main/resources/src/scss/",
    jsFiles = "src/main/resources/src/js/";

gulp.task("default", ["sass", "copy-angular-lib", "compress-js"]);

gulp.task("sass", function () {
    log("Generating CSS files " + (new Date()).toString());
    gulp.src(sassFiles + "all.scss")
        .pipe(sass({style: 'expanded'}))
        .pipe(autoprefixer("last 3 version", "safari 5", "ie 9"))
        .pipe(gulp.dest(cssTarget))
        .pipe(rename({suffix: '.min'}))
        .pipe(minifycss())
        .pipe(gulp.dest(cssTarget));
});

gulp.task("watch", function () {
    gulp.start("default");
    log("Watching scss and js files for modifications");
    gulp.watch(sassFiles + "**/*.scss", ["sass"]);
    gulp.watch(jsFiles + "**/*.js", ["compress-js"]);
});

gulp.task('copy-angular-lib', function () {
    log('Copy AngularJs libs');
    gulp.src('node_modules/angular/angular.min.js')
        .pipe(gulp.dest(jsTarget))
    gulp.src('node_modules/angular-route/angular-route.min.js')
        .pipe(gulp.dest(jsTarget))
});

gulp.task('compress-js', function () {
    log('Compessing JavaSript files');
    gulp.src([jsFiles + "**/module.js", jsFiles + "**/*.js"])
        .pipe(concat('all.js'))
        .pipe(babel())
        .pipe(gulp.dest(jsTarget))
        .pipe(rename('all.min.js'))
        .pipe(uglify())
        .pipe(gulp.dest(jsTarget));
});