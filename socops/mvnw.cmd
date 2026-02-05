@REM Soc Ops Maven Wrapper bootstrap for Windows
@REM Resolves the wrapper jar and delegates to it

@echo off
setlocal

set "SOC_OPS_BASE=%~dp0"
set "WRAPPER_PROPS=%SOC_OPS_BASE%.mvn\wrapper\maven-wrapper.properties"
set "WRAPPER_JAR=%SOC_OPS_BASE%.mvn\wrapper\maven-wrapper.jar"

if not exist "%WRAPPER_JAR%" (
    for /f "tokens=1,2 delims==" %%a in (%WRAPPER_PROPS%) do (
        if "%%a"=="wrapperUrl" (
            echo Downloading Maven Wrapper from: %%b
            powershell -Command "Invoke-WebRequest -Uri '%%b' -OutFile '%WRAPPER_JAR%'"
        )
    )
)

set "DIST_URL="
for /f "tokens=1,2 delims==" %%a in (%WRAPPER_PROPS%) do (
    if "%%a"=="distributionUrl" set "DIST_URL=%%b"
)

java %MAVEN_OPTS% -jar "%WRAPPER_JAR%" "--dist-url=%DIST_URL%" %*

endlocal
