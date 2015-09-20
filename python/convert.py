DECIMAL_NUMBER = int(raw_input('number: '))
BASE_CONVERT = int(raw_input('base: '))
CHARARRAY = ['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F']
ANSWER = ''
while(DECIMAL_NUMBER > 0):
	ANSWER = CHARARRAY[DECIMAL_NUMBER % BASE_CONVERT] + ANSWER
	DECIMAL_NUMBER = DECIMAL_NUMBER/BASE_CONVERT
print(ANSWER)	
