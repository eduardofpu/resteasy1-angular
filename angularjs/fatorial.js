

angular.module('fatorial', [])
  .controller('CONTROL', function($scope, $http) {
    $scope.fete = function(x) {
      var P = {
        method: 'POST',
        url: 'http://localhost:8080/service/math/ex3',
        headers: { 'Content-Type': 'application/json' },
        data: { 'requestFatorialBean': { 'fatorial':x}}
      };

      $http(P).then(function(evt) {
        $scope.valor = evt.data.responseFatorialBean.resposta;
		 $scope.a ;
      });
    };

  });
