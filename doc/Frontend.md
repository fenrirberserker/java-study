# 🌐 Frontend

> ⬆️ Main entry: [Study](Study.md)

---

## 📑 Index

- [🌐 HTML5](#-html5)
- [🎨 CSS](#-css)
- [📜 JavaScript](#-javascript)
- [🔷 TypeScript](#-typescript)
  - [Testing](#testing)
    - [Features](#features)
  - [React](#react)

---

## 🌐 HTML5
- Audio/Video
- Web Workers/Service Workers (Threads js)
- Local Storage (global)
- Session Storage (tab)

---

## 🎨 CSS
- Box model: margin (external), padding (internal)
- CSS selectors and combiners
- Specificity

---

## 📜 JavaScript
- **Scopes**
- **Callbacks**: A function that be passed as argument to be called later
- **Hoisting**: JS automatically moves all variable declarations at the top when compiling
- **Closures**
- **Promises**
- **Async functions**
- **Await operations/methods**

---

## 🔷 TypeScript
- **Superset of JS**: All JS code is valid TS code
- **Transpiled to JS**: TS code is converted to JS code
- **Static typing**: Types are checked at compile time
- **Optional typing**: Types can be omitted and inferred
- **Modern JS features**: ES6+ features like classes, modules, arrow functions, destructuring, etc

```bash
npm install -g typescript
```

### Testing
```javascript
// Jasmine
it("should be called", function() {})
beforeEach/beforeAll/afterEach/afterAll
expect().equals()
spyOn() // listener
toHaveBeenCalled()/toHaveBeenCalledWith(x,y)
```

#### Features
- **Type Annotations**: `let x: string = 'My string';`
- **Type Inference**
- **Union types**: `let somevalue: number | string`
- **Type assertions**: `let fixedstring: string = (value as number).toFixed(4)`
- **Optional parameters**: `message?: string`
- **Typed functions**: `function(): string{}`

### React
- **Component**: Building blocks of React applications
- **Props**: Properties to pass data from parent to child (unidirectional)
- **State**: Data that belongs to the component
- **Hooks**: functions that allow access to low-level react features
    - **useState**: used to manage the state
    - **useEffect**: used when component is mounted and when state changes
    - **useContext**: used to share data across all the component tree
    - **useRef**: creates a mutable object that keeps the reference between renders
