@echo off
echo.
echo
echo.
pause
echo.

cd %~dp0
cd..

call mvn clean package -Dmaven.test.skip=true

pause