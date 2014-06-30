'use strict';

/* Controllers */
var socialGlyphApp = angular.module('socialGlyphApp', []);

socialGlyphApp.controller('socialGlyphAppCtrl', function socialGlyphAppCtrl($scope, $http, $location)
    {
        var locationIndex = $location.absUrl().indexOf('location') + 9;
        var location = $location.absUrl().substr(locationIndex);
        var hostname = $location.host();

        $http.get('http://' + hostname + '/rest/SocialGlyph/' + location).success(function(data)
        {
            //TODO increment counter


            $scope.socialNetworks = data;
            $scope.showError = ((data == 'null') ? true : false)
        });

        $scope.selectThis=function(selectedNetwork)
        {
            //TODO animate the click


            for (var i=0;i<$scope.socialNetworks.length;i++)
            {
                console.log($scope.socialNetworks[i].name);
                if ($scope.socialNetworks[i].name == selectedNetwork)
                {
                    //TODO increment counter


                    window.location = $scope.socialNetworks[i].url;
                }
            }
        };
    });