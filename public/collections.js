// Snowflakes creation
function createSnowflakes() {
    const snowflakesContainer = document.getElementById('snowflakes-container');
    const snowflakeCount = 50;
    
    for (let i = 0; i < snowflakeCount; i++) {
        const snowflake = document.createElement('div');
        snowflake.classList.add('snowflake');
        
        // Random size between 2px and 6px
        const size = Math.random() * 4 + 2;
        snowflake.style.width = `${size}px`;
        snowflake.style.height = `${size}px`;
        
        // Random position
        snowflake.style.left = `${Math.random() * 100}vw`;
        snowflake.style.top = `${Math.random() * -100}px`;
        
        // Random animation duration (5-15 seconds)
        const duration = Math.random() * 10 + 5;
        snowflake.style.animationDuration = `${duration}s`;
        
        // Random delay
        snowflake.style.animationDelay = `${Math.random() * 5}s`;
        
        snowflakesContainer.appendChild(snowflake);
    }
}

// Update current year in copyright
function updateCopyrightYear() {
    document.getElementById('currentYear').textContent = new Date().getFullYear();
}

// Update hit count
function updateHitCount() {
    let hits = localStorage.getItem('pageHits');
    hits = hits ? parseInt(hits) + 1 : 1;
    localStorage.setItem('pageHits', hits);
    document.getElementById('hitCount').textContent = hits;
}

// Update current IST time
function updateCurrentTime() {
    const options = {
        timeZone: 'Asia/Kolkata',
        hour12: true,
        hour: '2-digit',
        minute: '2-digit',
        second: '2-digit',
        day: '2-digit',
        month: 'short',
        year: 'numeric'
    };
    
    const now = new Date();
    const istTime = now.toLocaleString('en-IN', options);
    document.getElementById('currentTime').textContent = istTime;
}

// Interactive List Demo - Modified to handle arrays of numbers
function setupListDemo() {
    const mergeBtn = document.getElementById('merge-btn');
    const findBtn = document.getElementById('find-btn');
    
    // Add button to add numbers to lists
    document.getElementById('add-to-list1').addEventListener('click', () => addNumberToList(1));
    document.getElementById('add-to-list2').addEventListener('click', () => addNumberToList(2));
    
    mergeBtn.addEventListener('click', mergeAndSortLists);
    findBtn.addEventListener('click', findValueBeforeTarget);
}

// Arrays to store the lists
let list1 = [];
let list2 = [];
let mergedList = [];
let sortedList = [];

function setupListDemo() {
    // Add buttons
    document.getElementById('add-to-list1').addEventListener('click', () => addNumbersToList(1));
    document.getElementById('add-to-list2').addEventListener('click', () => addNumbersToList(2));
    document.getElementById('clear-list1').addEventListener('click', () => clearList(1));
    document.getElementById('clear-list2').addEventListener('click', () => clearList(2));
    
    // Merge and find buttons
    document.getElementById('merge-btn').addEventListener('click', mergeAndSortLists);
    document.getElementById('find-btn').addEventListener('click', findValueBeforeTarget);
}

function addNumbersToList(listNum) {
    const inputField = document.getElementById(`list${listNum}-input`);
    const inputValues = inputField.value.split(',')
        .map(num => parseInt(num.trim()))
        .filter(num => !isNaN(num));
    
    if (inputValues.length > 0) {
        if (listNum === 1) {
            list1.push(...inputValues);
        } else {
            list2.push(...inputValues);
        }
        updateListDisplay(listNum);
        inputField.value = '';
    } else {
        alert('Please enter valid numbers separated by commas');
    }
}

function clearList(listNum) {
    if (listNum === 1) {
        list1 = [];
    } else {
        list2 = [];
    }
    updateListDisplay(listNum);
}

function updateListDisplay(listNum) {
    const list = listNum === 1 ? list1 : list2;
    const valuesElement = document.getElementById(`list${listNum}-values`);
    const elementsContainer = document.getElementById(`list${listNum}-elements`);
    
    valuesElement.textContent = `[${list.join(', ')}]`;
    
    // Create interactive elements
    elementsContainer.innerHTML = '';
    list.forEach((num, index) => {
        const element = document.createElement('div');
        element.className = 'list-element';
        element.innerHTML = `
            <span>${num}</span>
            <button class="remove-element" data-index="${index}" data-list="${listNum}">×</button>
        `;
        elementsContainer.appendChild(element);
    });
    
    // Add event listeners to remove buttons
    elementsContainer.querySelectorAll('.remove-element').forEach(button => {
        button.addEventListener('click', (e) => {
            const index = parseInt(e.target.getAttribute('data-index'));
            const listNum = parseInt(e.target.getAttribute('data-list'));
            removeElementFromList(listNum, index);
        });
    });
}

function removeElementFromList(listNum, index) {
    if (listNum === 1) {
        list1.splice(index, 1);
    } else {
        list2.splice(index, 1);
    }
    updateListDisplay(listNum);
}

function mergeAndSortLists() {
    // Merge lists
    mergedList = [...list1, ...list2];
    document.getElementById('merged-list').textContent = `[${mergedList.join(', ')}]`;
    
    // Sort merged list
    sortedList = [...mergedList].sort((a, b) => a - b);
    document.getElementById('sorted-list').textContent = `[${sortedList.join(', ')}]`;
    
    // Clear the target result when new lists are merged
    document.getElementById('target-result').textContent = '';
}

function findValueBeforeTarget() {
    const targetInput = document.getElementById('target-input').value;
    
    if (sortedList.length === 0 || !targetInput) {
        document.getElementById('target-result').textContent = "Please merge lists first and enter a target value";
        return;
    }
    
    const target = parseInt(targetInput);
    
    let result = "Target value not found in the list";
    let foundIndex = sortedList.indexOf(target);
    
    if (foundIndex !== -1) {
        let beforeValue = "N/A";
        let afterValue = "N/A";
        
        if (foundIndex > 0) {
            beforeValue = sortedList[foundIndex - 1];
        }
        
        if (foundIndex < sortedList.length - 1) {
            afterValue = sortedList[foundIndex + 1];
        }
        
        result = `
            Value before ${target}: ${beforeValue}
            <br>
            Value after ${target}: ${afterValue}
        `;
    }
    
    document.getElementById('target-result').innerHTML = result;
}

// Initialize everything when the page loads
window.onload = function() {
    createSnowflakes();
    updateCopyrightYear();
    updateHitCount();
    updateCurrentTime();
    setupListDemo();
    
    // Update time every second
    setInterval(updateCurrentTime, 1000);
};