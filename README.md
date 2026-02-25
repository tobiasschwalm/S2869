# S2869_Environment

## DevContainer Setup

Dieses Projekt verwendet eine DevContainer-Konfiguration für eine einheitliche Entwicklungsumgebung mit:
- Node.js
- Java SDK
- C++ Compiler (build-essential)
- PlantUML

### Voraussetzungen für DevContainer

Um den DevContainer nutzen zu können, müssen folgende Tools auf deinem System installiert sein:
- **Docker Desktop**: https://www.docker.com/products/docker-desktop
- **Visual Studio Code**: https://code.visualstudio.com/
- **VS Code Extension: Dev Containers**
  - Installiere die Erweiterung "Dev Containers" (ID: ms-vscode-remote.remote-containers) aus dem VS Code Marketplace

> **Hinweis:** Auf macOS und Windows ist Docker Desktop erforderlich. Unter Linux reicht eine funktionierende Docker-Installation.

**Start:**
1. Öffne das Projekt in VS Code
2. Wähle: "Reopen in Container"
3. Nach dem Build stehen alle Tools zur Verfügung:
   - `node -v`, `javac -version`, `g++ --version`, `plantuml -version`
