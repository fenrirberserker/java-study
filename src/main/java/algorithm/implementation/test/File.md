## BackendThe function `getDealersFromDB` can receive as parameter an object defining
        filters, for example it can take the following parameter:
        ```TypescriptgetDealersFromDB( { cp: '725'} )
        ```and it will filter the results by the given object parameter acting as a `like`or `CONTAINS` operator.
        Given this information implement a `GET` endpoint `/dealer?cp=72550` that should
        return all dealers following these rules:
        - If a dealer's `cp` matches in the first three digits (from left to right) it  is considered a close dealer; return at most 5 close dealers following these  rules:
- Sort all `cp` ASC including the targeted `cp` from the original request,    e.g. `["72500","72510","72550","72570","72580"]`  
- If possible take the first immediate lower `cp` and move it to the answer.   
- Taken the previous array this will be `"72510"`  
- If possible take the first immediate greater `cp` and move it to the answer.    
- Taken the previous array this will be `"72570"`  
- Repeat lower-greater until no more `cp` or answer array length is equal to 5
- How would you unit test your code? 
- # Functions Definition and responsesFn `getDealersFromDB`:
        ```JSON{
        "data":[
        {
        "dealerId": 1,
        "dealerName": "Autos Nuevos",
        "dealerBrand": "vw",
        "address": {
        "street":"Calle 1",
        "cp": "01906",
        "state": "CDMX"            }
        },
        {
        "dealerId": 2,
        "dealerName": "Autos Semi Nuevos",
        "dealerBrand": "vw",
        "address": {
        "street":"Calle 2",
        "cp": "01956",
        "state": "CDMX"            }
        }
        ],
        "nextToken":"12dadadopwqjepoqjeqwen"}