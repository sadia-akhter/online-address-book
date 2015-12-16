angular.module('addressBook')
.constant('contactActiveClass', 'btn-default')
.controller('contactListCtrl', ['$scope', 'contactActiveClass', 'ContactsFactory',
function($scope, contactActiveClass, ContactsFactory){
	$scope.contacts = ContactsFactory.query();
/*
   $scope.contacts = [
                      {
                          "id": 1,
                          "firstName": "Harry",
                          "lastName": "Steward",
                          "phone": "",
                          "email": "hpotter@domain.com",
                          "urls": ["www.harrypotter.com"],
                          "address": {
                             "street": "4 Privet Drive, Little Whinging",
                             "street2": "The cupboard under the stairs",
                             "city": "Surrey",
                             "state": "",
                             "zip": "",
                             "country": "UK"
                          }
                       },
                       {
                          "id": 2,
                          "firstName": "Sherlock",
                          "lastName": "Holmes",
                          "phone": "",
                          "email": "sholmes@domain.com",
                          "urls": ["www.sherlock.com"],
                          "address": {
                          "street": "221B Baker Street",
                          "street2": "",
                          "city": "London",
                          "state": "",
                          "zip": "NW1 6XE",
                          "country": "UK"
                          }
                       },
                       {
                          "id": 3,
                          "firstName": "Robert",
                          "lastName": "Langdon",
                          "phone": "6174951000",
                          "email": "rlangon@domain.com",
                          "urls": ["www.symbology.com"],
                          "address": {
                             "street": "86 Brattle Street",
                             "street2": "Langdon Residence",
                             "city": "Cambridge",
                             "state": "MA",
                             "zip": "02138",
                             "country": "USA"
                          }
                       },
                       {
                          "id": 4,
                          "firstName": "Harry",
                          "lastName": "Potter",
                          "phone": "",
                          "email": "hpotter@domain.com",
                          "urls": ["www.harrypotter.com"],
                          "address": {
                             "street": "4 Privet Drive, Little Whinging",
                             "street2": "The cupboard under the stairs",
                             "city": "Surrey",
                             "state": "",
                             "zip": "",
                             "country": "UK"
                          }
                       }
                    ]
	*/
/*	
   $scope.contacts = contacts.getContacts();
   $scope.selectedContact = contacts.getSelectedContact();

   $scope.$watch(
      function () {
         return contacts.getSelectedContact();
      },
      function (newContact, oldContact) {
         if (newContact != oldContact) {
            $scope.selectedContact = contacts.getSelectedContact();
         }
      }
   );

   $scope.getContactClass = function (contact) {
      return contact === $scope.selectedContact ? contactActiveClass : '';
   };

   $scope.selectContact = function (contact) {
      $scope.selectedContact = contact;
      contacts.setSelectedContact(contact);
   };

   $scope.addNewContact = function () {
      contacts.setContactState("new");
   }
   
   */
}]);
