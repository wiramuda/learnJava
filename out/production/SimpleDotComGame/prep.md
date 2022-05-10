## Declare 
an int array to hold the location cells. Call it locationsCell
##Declare
an int to hold the number of hits. call it numOfHits and set it to zero
----------------------------------------------------------------------------------------------------
##Declare 
a checkYourself() method that takes a string for user guest check it and return kill or hit
as results.
##Declare 
a setLocationsCell() setter method that takes an int array
----------------------------------------------------------------------------------------------------
##Method: 
String checkYourSelf(String userGuest)
    ## Get the user as a string parameter
    ## Repeat with each of the locations cells in the int array
        // Compare the user quest to the location cell
        ## if the user guest match
            ## Increment numOfHits
            // Find out it was the last locations cells 
            ## if number of hits is 3, Return "kill" as a result
            ## Else it was not a kill, so Return "hit"
            ## End if
        ## End if
    ## End Repeat
##End Method

##Method:
void setLocationCell(int[] cellLocations)
    ## Get the cell locations as an int array parameter
    ## Assign the cell locations parameter to the cell locations instance variable 
##End Method