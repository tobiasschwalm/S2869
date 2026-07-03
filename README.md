# S2869 - Lernumgebung

Lernumgebung für den Kurs **Prinzipien und Architekturen in der Softwareentwicklung**.

---

## Schnellstart mit DevContainer (empfohlen)

Voraussetzungen: [Docker Desktop](https://www.docker.com/products/docker-desktop) und [VS Code](https://code.visualstudio.com/) mit der Extension **Dev Containers** (`ms-vscode-remote.remote-containers`).

1. Repository klonen
2. Ordner in VS Code öffnen
3. Wenn VS Code fragt: **„Reopen in Container"** wählen – oder über die Befehlspalette (`Ctrl+Shift+P`) → _Dev Containers: Reopen in Container_
4. Warten bis der Container gebaut ist (einmalig ~2 min)

Danach stehen Java 21, Node.js und PlantUML direkt im integrierten Terminal zur Verfügung.

---

## Aufbau

Jede Aufgabe enthält:

- **Quelldateien** mit `// TODO`-Markierungen (eigene Implementierung)
- **`*Test.java`** – Unit-Test, der nach der Implementierung grün sein soll
- **`Makefile`** mit den Targets `compile`, `test`, `run`, `clean`

---

## Workflow

### 1. Datei öffnen

Eine der `*.java`-Dateien mit TODOs aus dem Ordner `src` öffnen.

### 2. Implementieren

Die mit `// TODO` markierten Stellen ausfüllen.

### 3. Testen

**Option A – VS Code Task (empfohlen)**

- `Ctrl+Shift+B` → **Kompilieren** (Build-Default-Task)
- `Ctrl+Shift+P` → _Tasks: Run Test Task_ → **Tests ausführen**

Kompilierungsfehler erscheinen direkt im **Problems**-Panel.

**Option B – Terminal**

```bash
cd src/14_strategy
make test      # kompiliert und führt Tests aus
make run       # startet das Hauptprogramm
make clean     # löscht kompilierte Dateien
```
