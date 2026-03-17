// Pipe-Hilfsfunktion: verkettet Funktionen von links nach rechts
const pipe = (...fns) => x => fns.reduce((v, fn) => fn(v), x);

// Filter 1: Ungültige Werte entfernen (< -50 oder > 60)
const removeInvalid = arr => arr.filter(t => t >= -50 && t <= 60);

// Filter 2: Kalibrierung um +0.5°C
const calibrate = arr => arr.map(t => t + 0.5);

// Filter 3: Alarm prüfen (> 30°C → "Alarm!", sonst "OK")
const checkAlarm = arr => arr.some(t => t > 30) ? "Alarm!" : "OK";

// Pipeline zusammensetzen
const processTemperatures = pipe(removeInvalid, calibrate, checkAlarm);

// Demo
const rawTemperatures = [-100, -2, 20, 30, 29.5, 61];

console.log("Eingabe:          ", rawTemperatures);
console.log("Nach removeInvalid:", removeInvalid(rawTemperatures));
console.log("Nach calibrate:    ", calibrate(removeInvalid(rawTemperatures)));
console.log("Ergebnis:         ", processTemperatures(rawTemperatures));
// Erwartet: "Alarm!"

console.log();

const safeTemperatures = [-2, 10, 20, 25];
console.log("Eingabe:          ", safeTemperatures);
console.log("Ergebnis:         ", processTemperatures(safeTemperatures));
// Erwartet: "OK"
