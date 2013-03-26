-- ========================================================================== --
--  Functions
-- ========================================================================== --

CREATE OR REPLACE PROCEDURE BORRAROBJECTOS AS 
BEGIN
  execute immediate 'DELETE FROM ITRACEMODEL CASCADE CONSTRAINTS';
  execute immediate 'DELETE FROM ARTEFACT CASCADE CONSTRAINTS';
  execute immediate 'DELETE FROM BLOCK CASCADE CONSTRAINTS';
  execute immediate 'DELETE FROM FEATURE CASCADE CONSTRAINTS';
  execute immediate 'DELETE FROM TRACELINK CASCADE CONSTRAINTS';
  execute immediate 'DELETE FROM TRACELINKELEMENT CASCADE CONSTRAINTS';
  execute immediate 'DELETE FROM TRACEMAP CASCADE CONSTRAINTS';
END BORRAROBJECTOS;
/

CREATE OR REPLACE FUNCTION MY_SPLIT(input_list varchar2,delimiter varchar2, ret_this_one number)
return varchar2
is
	v_list varchar2(32767) := delimiter || input_list;
	start_position number;
	end_position number;
begin
	start_position := instr(v_list, delimiter, 1, ret_this_one);
	if start_position > 0 then
		end_position := instr( v_list, delimiter, 1, ret_this_one + 1);
		if end_position = 0 then
			end_position := length(v_list) + 1; 
		end if;
		return(substr(v_list, start_position + 1, end_position - start_position - 1));
	else
		return NULL;
	end if;
end my_split;
/