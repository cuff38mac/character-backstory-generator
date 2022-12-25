

const apiKey = "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";
const fs = require("fs");
const modelName = "chatgpt";

fetch("https://api.openai.com/v1/models/downloads/generations", {
  method: "POST",
  headers: {
    "Authorization": `Bearer ${apiKey}`,
    "Content-Type": "application/json"
  },
  body: JSON.stringify({ model: modelName })
})
  .then(response => response.arrayBuffer())
  .then(buffer => {
    // Convert the ArrayBuffer to a Buffer object
    const data = Buffer.from(buffer);
    // Save the model file to a desired location
    fs.writeFileSync(`${modelName}.tar.gz`, data);
  });
