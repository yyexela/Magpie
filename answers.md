#Activity 3  
##Table for the findKeyword method  
**findKeyword("Brother Tom is helpful", "brother", 0);**  					_assuming Brother and brother are in the same case, otherwise it returns -1_  
| iteration | psn | before | after |  
|-----------|-----|--------|-------|  
| 1         | 0   | " "    | " "   |  
| returns 0 |     |        |       |  
|           |     |        |       |  
					
**findKeyword("I can't catch wild cats.", "cat", 0);**    					
| iteration  | psn | before | after |  
|------------|-----|--------|-------|  
| 1          | 8   | " "    | "c"   |  
| 2          | 20  | " "    | "s"   |  
| returns -1 |     |        |       |  			
					
**findKeyword("She's my sister", "sister", 0);**    					
| iteration | psn | before | after |  
|-----------|-----|--------|-------|  
| 1         | 9   | " "    | " "   |  
| returns 9 |     |        |       |  				
					
**findKeyword("I know nothing about snow plows", "snow" 0);**  				
| iteration  | psn | before | after |
|------------|-----|--------|-------|
| 1          | 3   | "k"    | "w"   |
| 2          | 7   | " "    | "t"   |
| 3          | 22  | "s"    | "w"   |
| returns -1 |     |        |       |		
