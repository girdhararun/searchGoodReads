# Search Good Reads via Slack Channel
To search for a book in GoodReads.com by title, author, or ISBN

### Steps to clone, execute the tests
```
git clone https://github.com/girdhararun/searchGoodReads.git
cd searchGoodReads
update slackIncomingHook in appdetails.properties ()
create Slash Command in Slack : /whatsthatbookname 
Eg : Rounte URL (ngrok) : http://11d5efb931be.ngrok.io/search
mvn compile
mvn exec:java -Dexec.mainClass="httpserver.SimpleHttpServer"
```

# Package details

---------------------------- Main--------------------------------------------------

## Models 
	POJO representation of json response

## httprequests
	Rest Assured methods
	
## keywords
    Action keywords for api interaction
    
## resources.appdata
    data required for application
    
-------------------------------- Test ------------------------------------

## java 
	contains - Test cases 