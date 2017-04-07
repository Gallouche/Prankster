# Prankster

## Description
 Prankster is simple java application used for sending, to a group of person, some funny forged emails. The user can define a list of victims and some funny mails in Json.

 Devolloped with fun by [Gallouche](https://github.com/Gallouche) and [Mathias Gislon](https://github.com/MathiasGilson)
 @ HEIG-VD


## How does it works ?
You just have to follow the install steps, specifie the SMTP server you want, the victims' mailing list, and if you want, some personnal text prank too.

The application will take all the mails in the list, create some group, and define a sender for each groups.

### Installation

You need to clone this repository, and open it in your pref IDE as a Maven project.

When it's done, you will need to edit the `config.json`, fill the adress list `mails.json` and if you want, add some personnal prank.

### Config file
* "host": "localhost" let it like this

* "port": 25 by default, you can change it to match with mock mock at 25000 for example

* "numberOfGroups": number of group you want, (care, if there is not enough mails, it will maybe create less group than required.

* "victimsListPath": path to the victims list, set by default at the root for the file `victims.json`

* "messagesListPath": path to the messsages list, set by default at the root for the file `messages.json`

### Mailing list
To add some victims to the list you need to add at the end of the last } and wite somthing like that :

Example:

    {
      "firstName": "Guy",
      "lastName": "Prat";
      "email": "guy.prat@test.com"
    },


###  Adding personnal prank text

It the same as the mailing list, add somting like that after the last }:

Example

    {
    	"subject": "Hello2",
    	"content": "content2"
    }

## Using a mock SMTP server

A mock SMTP server is a fake SMTP server on local, it will be useful to use if you want to do somes tests or if you are scared to be banned from your company or school.

Go see this [repo](https://github.com/dc55028/MockMock), follow the instuctions, match localhost and  port with the one you write in the config file `config.json` , run the application and enjoy !
